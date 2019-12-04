echo "\n\n\n####### Commit temporary files#####\n\n\n"
git commit -am "temporal#####\n\n\n"
echo "\n\n\n####### clean the project#####\n\n\n"
./gradlew clean
echo "\n\n\n####### run all tasks without cache#####\n\n\n"
./gradlew assembleDebug --no-build-cache --rerun-tasks --scan
echo "\n\n\n####### clean the project#####\n\n\n"
./gradlew clean # clean the project
echo "\n\n\n####### run with clean project but with cache#####\n\n\n"
./gradlew assembleDebug --scan
echo "\n\n\n####### run again without changing anything#####\n\n\n"
./gradlew assembleDebug --scan
echo "\n\n\n####### Modify featureA and featureB#####\n\n\n"
sed 's/Foo40()/Foo39()/g' featureA/baseA/src/main/java/com/devrel/experiment/large/dynamic/feature/a/Activity0.java | tee featureA/baseA/src/main/java/com/devrel/experiment/large/dynamic/feature/a/Activity0.java
sed 's/Foo40()/Foo39()/g' featureB/baseB/src/main/java/com/devrel/experiment/large/dynamic/feature/b/Activity0.java | tee featureB/baseB/src/main/java/com/devrel/experiment/large/dynamic/feature/b/Activity0.java
echo "\n\n\n####### run again after changing DF code#####\n\n\n"
./gradlew assembleDebug --scan
echo "\n\n\n####### Modify commonA source#####\n\n\n"
sed 's/Foo3999()/Foo3998()/g' common/commonA/src/main/java/com/devrel/experiment/large/dynamic/feature/common/a/Activity0.java | tee common/commonA/src/main/java/com/devrel/experiment/large/dynamic/feature/common/a/Activity0.java
echo "\n\n\n####### run again after changing common code#####\n\n\n"
./gradlew assembleDebug --scan
echo "\n\n\n####### Delete all fragments in features modules#####\n\n\n"
find . -name 'Fragment1.kt' -delete
echo "\n\n\n####### run again after changing All DF code#####\n\n\n"
./gradlew assembleDebug --scan
echo "\n\n\n####### Test done, resetting workspace#####\n\n\n"
git reset --hard
git reset --soft HEAD~1

