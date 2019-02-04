# passwords-server

_Copyright (c): MIT License_\
_feel free to modify as you please_\
_Contributors: Chriss Santi, Amen Amegnonan_

## Description
Password-server is a server for unique authentification key management.

It's a basic server which using AES encryption technology genereate and authenticate a unique identification key.

## Tools
> We use Java as programming language\
Spring Framework for the boostraping\
Mysql for the data base\
And Docker for the containers

## Resources
> SSH, AES, SHA256\
Docker docs [Docker get started](https://docs.docker.com/get-started/)\
Spring docs [Spring io](https://www.tutorialspoint.com/spring/index.htm)

## API

```
String generate(): Generate a new encryptided key
Boolean authenticate(String): Authenticate a given key
```