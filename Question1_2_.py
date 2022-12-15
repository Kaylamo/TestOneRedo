import re
# Question 1
print("Question One: \n")
Sentence = list(input("Input word(s) here: ").split())
print(Sentence)
print(len(Sentence), " input(s) \n")

# Question 2

print("Question Two: \n")

t_str = '12435652175327183dghsajdghsajdsak ahdhsgajk12r61753217653217'
 

print("The string: " + str(t_str))
 
res = re.sub("[A-Za-z]+", lambda ele: " " + ele[0] + " ", t_str)
 
print("Translates to: " + str(res))

