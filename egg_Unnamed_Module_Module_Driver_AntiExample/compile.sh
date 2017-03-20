
./clean.sh

# build db in legacy style 
javac -d db/build \
`find db/src/main/java -name "*.java"`

# build db jar
jar --create --file=lib/codetojoy.db.jar \
-C db/build . 

# This WON'T WORK without using automatic modules. See Notes.md

javac -d build/modules \
-classpath db/build \
--module-source-path src \
`find src -name "*.java"`

