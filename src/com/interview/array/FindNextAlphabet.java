package com.interview.array;

/**
 * Find a next character in a given char array. Ex: If given array is
 * {'C','D','R','S'} , and if the target is A , then, find the first occurrence
 * of next character to A in the above example ,find if B is there , if not,
 * find next char C ..
 * 
 *
 */

class FindNextAlphabet {

	// Binary search to find a given char in an array!
	public char findNextChar(char[] input, char target) {
		int start = 0;
		int end = input.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if ((int) input[mid] == (int) target) {
				return input[mid];
				// converting char to ASCII to compare it.
			} else if ((int) input[mid] > (int) target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return '\u0000';
	}

	public static void main(String[] args) {
		FindNextAlphabet nextAlpha = new FindNextAlphabet();
		char[] givenAlphabets = { 'C', 'D', 'R', 'S' };

		char givenChar = 'Z';
		char nextChar;
		char returned = '\u0000';

		while (returned == '\u0000') {
			nextChar = findMeNextChar(givenChar);
			returned = nextAlpha.findNextChar(givenAlphabets, nextChar);
			givenChar = nextChar;
		}
		System.out.println("Next char available in a given array is -->" + returned);

	}

	// Take advantage of ASCII to find the next available char
	public static char findMeNextChar(char inputChar) {
		// Given a alphabet array ,find the next available char

		int givenValue = (int) inputChar;
		int nextValue = 65;

		if (givenValue != 90 || givenValue != 122)
			nextValue = givenValue + 1;
		return (char) nextValue;
	}

}