install graphviz in https://graphviz.org
and using https://github.com/ferstl/depgraph-maven-plugin 
<b>mvn com.github.ferstl:depgraph-maven-plugin:aggregate -DcreateImage=true -DreduceEdges=false -Dscope=compile "-Dincludes=com.food.ordering.system*:*"</b> 
view dependency maven