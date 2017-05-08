
./clean.sh

# this will fail due to unresolved module
javac -d build `find src -name "*.java"`

