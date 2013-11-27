easyJSON
========

An easy to use and light-weight library for creating JSON in java.

INFORMATION
===========

Author: Yuvraj Singh Babrah |
Version: 1.0 |
Release Date: 28 November 2013

INSTRUCTIONS
============

1. Include the easyJSON package in the same path as that of your class files of a JAVA program.
2. Type "import easyJSON.*" (Basic Step)
3. A new json object will be created by instantiating the easyJSON class as follows: easyJSON json = new easyJSON();
4. To add key-value pairs simply use the add(String key, Object value) method as follows: json.add("Name", "Yuvraj Singh Babrah"); json.add("Age", 21); The key-value pairs are in accordance to the json rules laid out on http://json.org
5. To retrieve a value, use the get(String key) method as follows: json.get("Name"); The key should be in quotes. The return value, if of type String, will be without the quotes.
6. To remove a key-value pair, use the remove method(String key).
7. To instantiate the json array object use the easyJSONArray Constructor easyJSONArray array = new easyJSONArray();
8. To add elements, use the add(Object value) method.
9. To retreive the value, use the get(int key) method.
10. To remove an element, use the remove(_) method which takes either of index or Object as a paramenter.


CONTACT
=======

If you find any bug or feel that some feature is missing shoot me a mail on yuvrajb@users.noreply.github.com or direct message me on facebook: https://facebook.com/yuvraj.babrah | twitter: https://twitter.com/yuvrajb
