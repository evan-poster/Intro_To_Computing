people = {
    "Boole": "Boolean Logic",
    "De Morgan": "De Morgan's Law",
    "Shannon": "Theorize Logic",
    "Atanasoff": "Theorize Digital Comp",
    "Mauchly": "UNIVAC",
    "Von Neumann": "Computer Architecture"
}

while True:
    name = input('Enter a name (or q to quit): ')
    if name.lower() == 'q':
        break
    if name in people:
        print(people[name])
    else:
        print('Name not found')
