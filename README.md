# API-RESTful
[Detailed documentation](https://app.swaggerhub.com/apis-docs/utestroger/RS_API/1.0.0#/ "Detailed documentation")
# **RSCodeSec API**
The API provides programming language information and is organized around REST.


Contact Info: <roger.salazar.ca@gmail.com>

Version: 1.0.0

BasePath:/utestroger/RS\_API/1.0.0

Apache 2.0

http://www.apache.org/licenses/LICENSE-2.0.html
## **Access**
## **Methods**
[ Jump to [Models](#__Models) ]
### **Table of Contents**
#### [**Developers**](#Developers)
- [POST /v1/language](#create a language)
- [DELETE /v1/language/{id}](#delete a language)
- [GET /v1/language](#list of all languages)
- [GET /v1/language/{id}](#specific language list)
- [PUT /v1/language/{id}](#update a language)
# **Developers**
[Up](#__Methods)

POST /v1/language

add an lenguage (**create a language**)

Add an language to the system

**Consumes**

This API call consumes the following media types via the Content-Type request header:

- application/json

**Request body**

**addItems [addItem](#addItem) (required)**

*Body Parameter* — Language to add

**Produces**

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

- application/json

**Responses**

**201**

language created []()

**400**

invalid input, object invalid []()

**404**

not found endpoint []()

-----
[Up](#__Methods)

DELETE /v1/language/{id}

Delete language (**delete a language**)

remove a specific language.

**Path parameters**

**id (required)**

*Path Parameter* — The id that needs to be deleted

**Produces**

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

- application/json

**Responses**

**400**

Invalid id supplied []()

**404**

Language not found []()

-----
[Up](#__Methods)

GET /v1/language

(**list of all languages**)

The request returns all programming languages.

**Return type**

array[[LanguageItem](#LanguageItem)]

**Example data**

Content-Type: application/json

{}

**Produces**

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

- application/json

**Responses**

**200**

successful request

**400**

failed request []()

-----
[Up](#__Methods)

GET /v1/language/{id}

Get language by language id (**specific language list**)

**Path parameters**

**id (required)**

*Path Parameter* — The id that needs to be fetched. Use id 1 for testing.

**Return type**

[LanguageItem](#LanguageItem)

**Example data**

Content-Type: application/json

{"empty": false}

**Produces**

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

- application/json

**Responses**

**200**

successful operation [LanguageItem](#LanguageItem)

**400**

Invalid id supplied []()

**404**

id not found []()

-----
[Up](#__Methods)

PUT /v1/language/{id}

Updated language (**update a language**)

update a specific language.

**Path parameters**

**id (required)**

*Path Parameter* — id that need to be updated

**Request body**

**body [addItem](#addItem) (required)**

*Body Parameter* — Updated language object

**Produces**

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

- application/json

**Responses**

**400**

Invalid id supplied []()

**404**

language not found []()

-----
## **Models**
[ Jump to [Methods](#__Methods) ]
### **Table of Contents**
1. [LanguageItem - ](#LanguageItem)
1. [addItem - ](#addItem)
### **LanguageItem - [Up**](#__Models)**
**id (optional)**

[*Integer*](#integer)

*example: 1*

**name (optional)**

[*String*](#string)

*example: Java*

**launch (optional)**

[*String*](#string)

*example: 1995*

**strong\_typing (optional)**

[*Boolean*](#boolean)

*example: false*
### **addItem - [Up**](#__Models)**
**name**

[*String*](#string)

*example: Go*

**launch (optional)**

[*String*](#string)

*example: 2010*

**strong\_typing (optional)**

[*Boolean*](#boolean)

*example: false*


