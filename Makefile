APP=RagDoll
JAVAC=/opt/java/bin/javac
JAVA_FILES= RagDoll.java RagWindow.java

all:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p com/fredollinger
	mv *.class com/fredollinger

test:
	java -cp . com/fredollinger/$(APP)

clean:
	rm -rvf com/fredollinger
