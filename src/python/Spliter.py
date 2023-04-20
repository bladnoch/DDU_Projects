#   Spliter.py: duplicated main.py
#   리스트에 알파벳, 숫자 구분해서 저장 후 출력
#   3-30-2023
#   Dougnuk Kim

def isalpa(item):
    tf=True;
    if item.isdigit()==True:
        tf=False
    return tf

def make_num_List(input):
    temp=''     # 숫자문자만 저장을 위한 변수
    # 반복문으로 숫자, 알파벳 확인 후 숫자만 temp에 저장
    for j in range (len(input)):
        #def isalpa() 진입
        print(input[j], "는 ",isalpa(input[j])) # def isalpa(inputList[i][j])
        if input[j].isdigit()==True:
            temp+=input[j]
    return temp


# 매인함수 시작
if __name__ == '__main__':
    # 인풋 없음
    inputList=['A37B','22CC','BB8F','3A9A']

    # 인풋 있음 ex) fy7g9 90jm 8hd4v 6fgh
    # inputList=input("n num and alphabet combos here:").split(" ")

    for i in range (len(inputList)):
        # def make_num_list 진입
        inputList[i]=make_num_List(inputList[i]) # def make_num_list(리스트)
        print("")
    print("변경된 inputList의 요소는", inputList, "입니다.")