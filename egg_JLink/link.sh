
echo "JAVA_HOME is ${JAVA_HOME}"

rm -rf serviceapp 

jlink --module-path $JAVA_HOME/jmods:build/modules \
--add-modules net.codetojoy.service \
--output serviceapp
