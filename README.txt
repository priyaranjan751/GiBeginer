===WineD3D for Windows===
DirectX 1-11 to OpenGL wrapper.

==What is it good for?==
WineD3D for Windows can be very useful to get old games to work properly on newer systems, especially Windows 8 and newer since they lack 16 bit screen modes.

==System requirements==
Microsoft Windows XP or newer (x86 o x64); Windows RT is not supported
OpenGL compatible video card and driver

==Instructions==
For DirectX 8 games:
copy d3d8.dll, libwine.dll and wined3d.dll in the game's executable directory

For DirectX 9 games:
copy d3d9.dll, libwine.dll and wined3d.dll in the game's executable directory

For DirectX 10 games:
copy d3d10.dll, d3d10core.dll, libwine.dll and wined3d.dll in the game's executable directory

For DirectX 11 games:
copy d3d11.dll, dxgi.dll, libwine.dll and wined3d.dll in the game's executable directory

For DirectX<=7 games:
Getting these games to work is a bit tricky.
-copy ddraw.dll, libwine.dll and wined3d.dll in the game's executable directory
-rename ddraw.dll, but make sure the file name is still 5 characters long (for instance ddfuk.dll)
-use an hex editor (for instance HxD) to replace all references to ddraw.dll with ddfuk.dll (or whatever you renamed the dll to). You will have to do this for all .exe, .dll (except our dlls), .ren, ... files (anything that may contain code)

Warning:
Do NOT copy any of these files into Windows\System32, Windows\SysWoW64 or any path included in the PATH environment variable or Windows will no longer work!

==Limitations==
WineD3D is far from perfect, and many games will not work.
Also, keep in mind that sometimes you must be a bit creative to get old games to work. PCGamingWiki is a pretty good source of information.

==Source code?==
There's no source code, I just downloaded Wine via git and cross-compiled the DLLs using mingw32 on Debian for x86.
If you want to do it yourself, see http://adolfintel.com/?p=wined3d/build.frag

