import matplotlib.pyplot as plt
figure = plt.figure()
axes = figure.add_subplot(111)
noise = [20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70]
stress = [10, 11, 15, 20, 30, 42, 55, 70, 88, 110, 150]
axes.scatter(noise, stress, s=50)
plt.xlabel('noise')
plt.ylabel('stress')
plt.show()
