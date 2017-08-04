
./clean.sh

javac -d build/modules \
--module-source-path com.jdojo.address/src:com.jdojo.person/src \
`find com.jdojo.* -name "*.java"`

jar --create --file=mlib/com.jdojo.address.jar \
-C build/modules/com.jdojo.address .

jar --create --file=mlib/com.jdojo.person.jar \
--main-class=com.jdojo.person.Person \
-C build/modules/com.jdojo.person .

