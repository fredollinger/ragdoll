APP=RagDollApp
JAVAC=/opt/java/bin/javac
JAVA_FILES = *.java

all:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p com/fredollinger
	mv *.class com/fredollinger

test:
	java -cp . com/fredollinger/$(APP)

clean:
	rm -rvf com/fredollinger
