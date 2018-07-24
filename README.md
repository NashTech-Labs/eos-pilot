# eos-pilot  
A scala bootstrap app to create EOS wallet.  

## Pre Requisites:

You must have eos installed on your system. If not, please look at the build and install instruction at   
 https://developers.eos.io/eosio-nodeos/docs/install-nodeos  

## How to run  
After building and installing the EOS, go to the eos source directory and run the below commands to start keosd   
```bash
cd eos/build/programs
keosd  --http-server-address=127.0.0.1:8899 --http-validate-host=false --plugin eosio::http_plugin --verbose-http-errors
```
#### Clone Scala-API-Wrapper

```bash
git clone git@github.com:EOSEssentials/Scala-API-Wrapper.git
cd Scala-API-Wrapper
sbt publishLocal  
```

Once you've cloned this repo, switch to dir: eos-pilot and: 
 ```bash
 sbt run  
 ```
