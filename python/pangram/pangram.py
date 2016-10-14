import string

"""def is_alphabet(ch):
	return ch in string.lowercase

def has_all_alphabets(input):
	for ch in string.lowercase:
		if ch not in input:
			return False
	return True


	clean = filter(is_alphabet, input.lower())
	return has_all_alphabets(clean)"""
def is_pangram(input):
	cleanstr= filter(lambda ch: ch in string.lowercase, input.lower())
	return set(cleanstr) == set(string.lowercase)
