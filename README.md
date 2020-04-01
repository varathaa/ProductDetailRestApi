# ProductDetailRestApi
rest api webservice using spring boot

https://github.com/varathaa/ProductDetailRestApi.git

This API only for fetch products and products configuration details. this api request created using java 1.8

Request1
============

url: http://localhost:8080/api/getproductdetails

Basic Authentication

username:productuser
password:productpass

response
----------

[
    "COKE",
    "PEPSI",
    "7UP",
    "SPRITE"
]

Request2
============

url: http://localhost:8080/api/getconfigdetails
asic Authentication

username:configuser
password:configpass

Sample Response
-----------------
[
    {
        "skuId": "COKE",
        "skuName": "Coca Cola 2L",
        "price": "100"
    },
    {
        "skuId": "PEPSI",
        "skuName": "Pepsi 2L",
        "price": "90"
    },
    {
        "skuId": "7UP",
        "skuName": "7 UP 2L",
        "price": "95"
    },
    {
        "skuId": "SPRITE",
        "skuName": "Sprinte 2L",
        "price": "110"
    }
]


