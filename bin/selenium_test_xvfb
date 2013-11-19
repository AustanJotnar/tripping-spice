#!/bin/bash

# Xvfb
sudo bin/xvfb start
export DISPLAY=:99

# Run tests
export STAGING_SERVER=${STAGING_SERVER:='http://localhost:4567'}
mvn test-compile failsafe:integration-test failsafe:verify
EXIT_CODE=$?

# Clean up
sudo bin/xvfb stop

exit $EXIT_CODE