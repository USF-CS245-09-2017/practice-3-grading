#!/bin/bash

# Obtain Student info
echo "Enter Username"
read username
echo "Enter Project Name"
read project
echo "Enter Branch Name"
read branch

# Remove repository if exists
if [ -d "$username" ]; then
  rm -rf $username
fi

# Clone repo
echo "Cloning https://github.com/$username/$project -b $branch --single-branch $username"
git clone https://github.com/$username/$project -b $branch --single-branch $username

# Copy over files to project
cp $username/*.java src/main/java/

# Run Tests
mvn test
