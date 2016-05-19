# RequestBody
A simple Grails web application that simply returns information about whatever incoming HTTP request it was called with, including the request method, all request headers and values, and the request body. Useful for debugging.

## Usage
Simply deploy [target/RequestBody.war] to any Java web application server or container, such as Tomcat.

From your clientside application, call ```url-of-server/RequestBody/callMe/maybe```, with the necessary headers and body.

An example HTTP call:

```
PATCH /RequestBody/callMe/maybe HTTP/1.1
Host: 127.0.0.1:8080
header1: 123
anotherHeader: dqdq
Cache-Control: no-cache

{"request_body_param_1":false,"request_body_param_2":42,"request_body_param_3":"a string"}
```

RequestBody returns the following to your clientside application:

```
METHOD: PATCH
HEADERS:
host: 127.0.0.1:8080, connection: keep-alive, content-length: 91, anotherheader: dqdq, content-type: text/plain;charset=UTF-8, header1: 123, 
BODY:
{"request_body_param_1":false,"request_body_param_2":42,"request_body_param_3":"a string"}
```


## Modifying the App

Code is simply at [grails-app\controllers\requestbody\CallMeController.groovy]
