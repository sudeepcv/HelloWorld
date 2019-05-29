# HelloWorld

mvn clean install

mvn exec:java

To open in gitpod ide:  https://www.gitpod.io#https://github.com/sudeepcv/HelloWorld.git


Track all remote git branches as local branches:

for i in `git branch -a | grep remote | grep -v HEAD | grep -v master`; do git branch --track ${i#remotes/origin/} $i; done
