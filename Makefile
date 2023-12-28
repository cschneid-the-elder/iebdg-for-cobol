

JC = javac
CP = "./class:./commons-cli-1.4.jar:./antlr-4.13.1-complete.jar"
JCOPT = -d ./class -g -Xlint -cp $(CP)
#JCOPT = -d ./class -g -cp $(CP)
JCOPT1 = -d ./class -cp $(CP)
AOPT = -visitor -listener
#AOPT = -o ./src -lib ./src -visitor -listener

./class/%.class: ./src/%.java
	echo `date` $< >>build.log
	$(JC) $(JCOPT) $<

./src/%.tokens: ./src/%.g4
	echo `date` $< >>build.log
	java -jar ./antlr-4.13.1-complete.jar $(AOPT) $<
	$(JC) $(JCOPT1) ./src/$**.java
	

all: ./src/CobolLexer.tokens ./src/CobolParser.tokens ./class/Main.class ./class/DDNodeType.class ./class/DDNode.class ./class/DataDescriptionEntryListener.class

.PHONY: all test jar testrig init test1

test:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	echo `date`
	./src/tester all lex
	echo `date`
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) lex
endif

test1:
ifeq ($(strip $(n)),)
	echo `date` $@ >> build.log
	echo `date`
	./src/tester all prcs
	echo `date`
else
	echo `date` $@ $(n) >> build.log
	./src/tester $(n) prcs
endif

jar:
	echo `date` $@ >> build.log
	jar cfm DG4CBL.jar manifest -C class .

testrig:
	echo `date` $@ $(n) >> build.log
	java -cp ./class:.:./antlr-4.13.1-complete.jar org.antlr.v4.gui.TestRig Cobol startRule -gui -tokens < ./testdata/test_$(n).struct

init:
	mkdir class

./src/CobolParser.tokens: ./src/CobolLexer.tokens

./class/Main.class: ./class/DataDescriptionEntryListener.class ./class/DDNode.class

./class/DataDescriptionEntryListener.class: ./class/DDNode.class

./class/DDNode.class: ./class/DDNodeType.class

