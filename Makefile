APP=RagDollApp
JAVAC=/opt/java/bin/javac
JAVA=/opt/java/bin/java
#JAVAC=/usr/bin/javac
JAVA_FILES = *.java

all:
	$(JAVAC) $(JAVA_FILES)
	mkdir -p com/fredollinger
	mv *.class com/fredollinger
	zenity --info

test:
	$(JAVA) -cp . com/fredollinger/$(APP)

clean:
	rm -rvf com/fredollinger
