echo off
set path=C:\Program Files\Java\jdk1.8.0_101\bin
set include=C:\Program Files\Java\jdk1.8.0_101\include
set lib=C:\Program Files\Java\jdk1.8.0_101\lib
set link=C:\Program Files\Java\jdk1.8.0_101\bin
javac -version Main.java
java Main
javap -c Main>1.txt
javadoc Main.java
pause