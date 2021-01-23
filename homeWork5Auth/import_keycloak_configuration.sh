#!/usr/bin/env bash

# Get token to use it in next api calls
access_token=$(curl -s -d "client_id=admin-cli"   \
-d "username=admin"   \
-d "password=password"  \
-d "grant_type=password"  \
"http://arch.homework/auth/realms/master/protocol/openid-connect/token" \
| jq '.access_token' | tr -d '"')

echo $access_token

# Import Realm

curl \
  --request POST \
-H "Accept: application/json" \
-H "Content-Type: application/json" \
  -H "Authorization: Bearer $access_token" \
  --data "@fedyiv-otus-realm.json" \
  "http://arch.homework/auth/admin/realms"


#  --data "$(cat fedyiv-otus-realm.json)" \
#  --data "$(cat fedyiv-otus-realm.json)" \



echo "Fedyiv-otus realm imported"
