
rm -rf work 
rm -rf out
mkdir work out

jdeps --generate-module-info work $1

ls -l work
