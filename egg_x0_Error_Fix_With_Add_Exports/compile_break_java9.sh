
./clean.sh

# this will fail due to internal class
javac -d build `find src -name "*.java"`

