import string

def is_alphabet(ch):
	return ch in string.lowercase

def has_all_alphabets(input):
	for ch in string.lowercase:
		if ch not in input:
			return False
	return True

def is_pangram(input):
	clean = filter(is_alphabet, input.lower())
	return has_all_alphabets(clean)
