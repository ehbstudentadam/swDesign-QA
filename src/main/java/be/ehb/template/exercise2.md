## Conversion program
We want to implement a program that can convert files of a certain format to another
format. For example, wav files can be converted to mp3, avi to mpg, ... Te conversion
program will always follow the same steps when converting a file:

1. Validating the source file: what is the file structure; is it really the file type that is
   specified in the extension?
2. Specify a destination folder. The user selects a specific folder where the converted
   file will end up.
3. Calculate approximate file size of the target file. For this purpose we will implement
   a number of fancy algorithms that ensure that we can make a fairly good estimate
   of the space required for the target file.
4. Check whether there is enough space to save the target file (taking into account
   the calculated file size and the free space on the target drive)
   1
5. Entering meta tag information. For example, when we convert to MP3, the user
   will be able to enter the name of the song, the performer, and the album.
6. Actual conversion of file to the requested target type.

Implement the following three file conversions:
- AVI to MPG
- WAV to MP3
- CSV to XLS