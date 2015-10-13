APP=RagDollApp
JAVAC=/opt/java/bin/javac
#JAVAC=/usr/bin/javac
JAVA_FILES = *.java

all:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p com/fredollinger
	mv *.class com/fredollinger
	zenity --info

test:
	java -cp . com/fredollinger/$(APP)

clean:
	rm -rvf com/fredollinger
