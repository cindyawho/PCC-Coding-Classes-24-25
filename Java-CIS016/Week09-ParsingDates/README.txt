Complete main() to read dates from input, one date per line. Each date's format must be as follows: March 1, 1990. Any date not following that format is incorrect and should be ignored. Use the substring() method to parse the string and extract the date. The input ends with -1 on a line alone. Output each correct date as: 3-1-1990.

Ex: If the input is:

    March 1, 1990
    April 2 1995
    7/15/20
    December 13, 2003
    -1

then the output is:

    3-1-1990
    12-13-2003

Use the provided getMonthAsInt() method to convert a month string to an integer. If the month string is valid, an integer in the range 1 to 12 inclusive is returned, otherwise 0 is returned. Ex: getMonthAsInt("February") returns 2 and getMonthAsInt("7/15/20") returns 0.