# MilesToKmConverter
(Master 
[![Tests](https://github.com/Morphylix/MilesKmConverter/actions/workflows/gradle-tests.yml/badge.svg?branch=master)](https://github.com/Morphylix/MilesKmConverter/actions/workflows/gradle-tests.yml) )
(Develop
[![Tests](https://github.com/Morphylix/MilesKmConverter/actions/workflows/gradle-tests.yml/badge.svg?branch=develop)](https://github.com/Morphylix/MilesKmConverter/actions/workflows/gradle-tests.yml) )
Converter that can convert miles to km, km to meters and vice versa.

## How to use

with Postman, send a get query on:
``` 
http://0.0.0.0:8080/ 
```
Available routes:
```
http://0.0.0.0:8080/mtok?miles=*NUBMER*            // miles to km
http://0.0.0.0:8080/ktom?km=*NUBMER*               // km to miles
http://0.0.0.0:8080/ktometers?km=*NUBMER*          // km to meters
http://0.0.0.0:8080/meterstokm?meters=*NUBMER*     // meters to km
```
## How to run with docker
Clone repository:
``` console
$ git clone https://github.com/Morphylix/MilesKmConverter.git
```
CD into app folder:
``` console
$ cd MilesToKmConverter
```
Build docker image:
``` console
$ docker build -t MilesToKmConverter
```
Run docker image:
``` console
$ docker run -p 8080:8080 MilesToKmConverter
```
=======
MilesKmConverter
===============================
An app for converting *_miles_* to *_km_* and vice versa
