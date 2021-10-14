def calcPay(hours, rate):
    totalPay = float(rate) * float(hours)
    return totalPay


def getEmpl(emplid, name, hours, rate):
    empls = []
    emplid = emplid
    print('Employee ID: ', emplid)
    name = name
    print('Name: ', name)
    empls.append(name)
    payRate = rate
    print('Hourly Rate: ', float(rate))
    empls.append(payRate)
    hours = float(hours)
    print('Hours Worked: ', float(hours))
    empls.append(hours)
    return empls


inputFile = open('CalcEmplPay.txt', 'r')
empls1 = inputFile.read()
empls_list = empls1.splitlines()

for x in empls_list:
    x.split(",")
    r = getEmpl(x.split(",")[0], x.split(",")[1], x.split(",")[2], x.split(",")[3])
    print("Total Pay: ", calcPay(r[2], r[1]))
    print('')

inputFile.close()
