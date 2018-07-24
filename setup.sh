#!/usr/bin/env bash
# Clone and install EOSIO
cd
git clone https://github.com/EOSIO/eos --recursive
cd eos
./eosio_build.sh
cd build
sudo make install

# Run keosd
cd programs/keosd
keosd  --http-server-address=127.0.0.1:8899 --http-validate-host=false --plugin eosio::http_plugin --verbose-http-errors
