class Student:
    def __init__(self, id, first, last, grade, active):
        self.id = id
        self.first = first
        self.last = last
        self.grade = grade
        self.active = active
        if int(self.grade) > 90:
            self.grade = 'A'
        elif int(self.grade) == 90:
            if self.active == 'E':
                self.grade = 'A'
            else:
                self.grade = 'B'
        elif 80 < int(self.grade) < 90:
            self.grade = 'B'

        elif 70 < int(self.grade) <= 80:
            if self.active == 'E':
                self.grade = 'C'
            else:
                self.grade = 'D'
        else:
            if self.active == 'E':
                self.grade = 'C'
            else:
                self.grade = 'F'

Student_List = []
file=open("file.txt")
data=file.read().replace("\n"," ")
list=data.split(" ")
list_temp=list[::-1]
rl=[]
tp=()
newL=[]

while(len(list_temp)!=0):
    a=list_temp.pop()
    if a.startswith("11"):
        rl.append(a)
        for i in range(0,4):
            rl.append(list_temp.pop())
tempp=rl[::-1]
length=len(tempp)
while(len(tempp)!=0):
    for j in range(int(length/5)):
        a=tempp[-1]+' '+tempp[-2]+' '+tempp[-3]+' '+tempp[-4]+' '+tempp[-5]
        newL.append(a)
        tempp.pop()
        tempp.pop()
        tempp.pop()
        tempp.pop()
        tempp.pop()
#Create a list of Student object
while(len(newL)!=0):
    for x in range(int(length / 5)):
        tempdata =newL.pop().split()
        Student_List.append(Student(tempdata[0], tempdata[1], tempdata[2], tempdata[3], tempdata[4]))

#Sort the Student_List by last name
Student_List= sorted(Student_List, key = lambda Student : Student.last)


for i in Student_List:
    print(i.id, i.first, i.last, i.grade)


This is used for test GIt
