
def replace_word(string, old_word, new_word):
    return string.replace(old_word, new_word)


string = "The quick brown fox jumps over the lazy dog."
old_word = "dog"
new_word = "cat"
print(replace_word(string, old_word, new_word))
