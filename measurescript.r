n <- 50
vecdata2 <- c()
vecdata3 <- c()
for(i in 1:n){
	system("java -cp slutprojektutvprog lab data1.txt data3.txt result3.txt result4.txt result5.txt result6.txt 600")
	data <- read.csv("result4.txt")
	data2 <- data[,2]
	data2 <- data2[-(450:600)]
	result <- mean(data2)
	vecdata2 <- c(vecdata2, result)
	data3 <- data[,3]
	data3 <- data3[-(450:600)]
	result <- mean(data3)
	vecdata3 <- c(vecdata3, result)
	}
print(mean(vecdata2))
print(mean(vecdata3))
t.test(vecdata2, vecdata3)
source("https://fileadmin.cs.lth.se/cs/Education/EDAA35/R_resources.R")
confidenceInterval(vecdata2, confidenceLevel=0.95)
source("https://fileadmin.cs.lth.se/cs/Education/EDAA35/R_resources.R")
confidenceInterval(vecdata3, confidenceLevel=0.95)
#plotresult("result4.txt") 
#pdf("result4.pdf")

#plotresult("result4.txt")                
ymax <- max(vecdata2, vecdata3)        

boxplot(list("Custom Tree" = vecdata2, "Set Tree"  = vecdata3),
	notch   = TRUE,
      ylab    = "Time (ns)"
      #,ylim    = c(0, ymax)
)       
pdf("result4.pdf")
dev.off()