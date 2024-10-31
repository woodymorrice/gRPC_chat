#!/bin/bash

echo "Waiting for the server to initialize.."
sleep 5

./mvnw exec:java -Dexec.mainClass='wmfx.Client' --quiet
