## Requirements

You'll need a JDK 8 installation available. The original client was built for 6 at the time.

## Running

Start the server, and run `./gradlew run`! You'll be connected to localhost by default.

## What's left?

### Refactoring

Plenty of refactoring TODO. We've assigned names to all 1230 classes even if a few hundred are placeholder-like. We're going through methods and fields now based on known leaks.

### Packaging

We have to organize all of the classes into packages. There's actually a process to this, based on `ref/obfname.txt`:
https://docs.google.com/spreadsheets/d/1SoBi8hXoefqYuoLOxy3pmeABUXxXzNHE6ZVQlyaxzpw

It isn't figured out completely, but it definitely isn't alphabetical (or sane). This order is unchanging between different gamepacks and revisions.
1. All packages are sorted by this unknown method and each class assigned a name from the obfname list.
2. Classes are separated if they `extend` anything. Classes that extend something that extends something else are also separated again. There can be as many as 4-levels separated here.
3. Classes that extend java.* classes are last in their separated "group".
4. Interfaces are not separated and will appear in the first level even if they extend a class.
5. Classes that extend another class are in the order of the original group. It's sorted by what it extends.

The very last class in the list has `extends IllegalArgumentException extends RuntimeException extends Exception`.

Essentially it ends up looking like...
```
Class1
Class2
Class3
...
Class50 extends Class1
Class51 extends Class2
Class100 extends Class2
Class52 extends Class3
...
Class150 extends Class100
```

It is *not* alphabetical -- that is to say they aren't recursing a directory tree and working off that. Classes are not alphabetical and packages are not alphabetical. You can see for example, LZMA classes between graphics and entity packages.  
Despite the challenges this is still useful to know where a package *ends*, since there is an abrupt change in context. We can build a grouping even if we don't have original names.

## Credits

- Graham for your work on OpenRS2/550
- zwyz for your work on 915
- Dane for your work on 317
- Polar for advice
- Any contributors here :)
