import 'package:flutter/material.dart';
import 'package:treehuggr/pages/home.dart';

void main() => runApp(new MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      title: 'treehuggr',
      theme: new ThemeData(
        primarySwatch: Colors.green
      ),
      home: new MyHomePage(title: 'Cal Hacks 5.0!'),
    );
  }
}