export PATH=$JENKINS_HOME/tools/hudson.tasks.Maven_MavenInstallation/MAVEN/bin:$PATH

if [ "$TEST_TO_RUN" = "All" ]; then
    mvn clean test
else
    mvn clean test -Dtest=$TEST_TO_RUN
fi