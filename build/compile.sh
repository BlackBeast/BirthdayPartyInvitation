echo 'cleaning...'
rm out/*.class
echo 'compiling source..'
javac -cp "src;lib/junit-4.12.jar" -d out src/Sample.java
echo 'compiling test..'
javac -cp "src;lib/junit-4.12.jar" -d out test/ComplexNumberTest.java