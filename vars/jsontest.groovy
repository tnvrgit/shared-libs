#!/usr/bin/env groovy
def call(String env) {

    if("${env}" == "sit1") {
        echo "choice parameter is sit1"
    }
    else if ("${env}" == "sit2") {
        echo "choice parameter is sit2"
    }    

}
