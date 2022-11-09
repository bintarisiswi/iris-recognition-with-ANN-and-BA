# Overview
## Iris Image Recognition Using Hybrid Backpropagation Neural Network and Bat Algorithm
[1] The origins of modern iris image recognition were founded in 1986 when Leonard Flom and Aran Safir filed a patent for the first iris image recognition system but without any algorithm. 

[2],[3] The algorithm underlying the iris image recognition was developed by Dr. John Daugman, a Harvard Ph.D. graduate and well-known computer scientist at the University of Cambridge, England. 
Has the US Patent no. 5,291,560 on behalf of Daugman and deployed at Iridian Technologies, Inc., which is one of the world's leading vendors of iris-based systems.

[4]Among all the biometric characteristics, the texture pattern of the iris is believed to be the most distinguishable. Compared to facial or other characteristics that change more drastically, the iris remains relatively stable and is rarely affected by external elements, because it is located in the inner eye organ. In addition, which distinguishes other biometrics such as fingerprints, the iris is seen as a very reliable biometric technology due to its stability, and the high variation of the iris between individuals.

Based on the description above, this paper will examine the recognition of iris imagery using a hybrid backpropagation neural network and the bat algorithm.

## Image Processing
<h4>[5]Image processing aims to improve image quality, where the resulting image can provide clear information and 
information on the characteristics of the image is in the form of numeric

### 1. Grayscale
<h5> [5] The color image consists of 3 matrix layers, namely R-layer $(r)$, G-layer $(g)$, and B-layer $(b)$ 
with the value of an image being represented between 0 to 255. This process converts the 3 layers above into 1 matrix layer. 
gray-scale(s) and the result is a gray-scale image. In this image there is no more color, there is a degree of gray.
 
 $$s=(r+g+b)/3$$

### 2. Segmentation 
<h5>[5] The stages in the segmentation process are that each segment of an image is searched for the average segment, 
namely the number of intensity or grayscale levels of the total pixels in one segment divided by the number of pixels from that segment.
So that each segment consists of pixels that have the same grayscale level.

### 3. Normalization
<h5>[5] The normalization process in the image is the process of 
determining the segment intensity value of the image to be between 0 and 1 by dividing the average segment by the highest grayscale level.

## Backpropagation Algorithm
#### [6] Backpropagation is a supervised training algorithm. In essence, training with the backpropagation method consists of three steps, namely as follows:
* Feedforward
* Backpropagation of error
* Bias and weight updates
 
## Bat Algorithm
<h5> [6] The Bat Algorithm is inspired by the behavior of small bats (microbats) when preying, determining the location of perches, 
and avoiding obstacles while flying by using sound waves that are emitted, called echolocation

## Hybrid Backpropagation Neural Network and Bat Algorithm
#### The process of iris image recognition using a hybrid backpropagation neural network and a bat algorithm aims to obtain weights and biases that will be used in the validation test. 
#### The steps for training the backpropagation neural network and the bat algorithm are as follows:

* Inputting data and initializing the parameters of the bat algorithm and backpropagation neural network. Backpropagation parameters are target error, and learning rate. The parameters of the bat algorithm are the initial population of bats $(pop size)$, maximum iteration $(t)$, loudness decrease coefficient $(𝛼)$, pulse rate increase coefficient $(𝛾)$, minimum frequency $( f𝑚 )$, maximum frequency $(fmax )$.
* Generating initial population of bats consisting of position $(𝑥𝑖)$, speed $(𝑣𝑖)$, loudness $(𝐴𝑖)$, pulse rate $(𝑟𝑖)$.
* Backpropagation training process
    * Conversion of each element of the Bat's position into weights and biases in Backpropagation.
    * Feedforward process
    * Backpropagation of error process
    * Update weights and bias
    * Calculate MSE
    * Perform steps c.ii to c.v for all data patterns
    * Calculate the average MSE
    * Convert weight and bias to bat position
* Calculate the objective function so that the value of the objective function 	of each bat in the initial position is obtained, with the following equation
 $MSE: (1/(MSE+1))$
* Compare the objective function values of each bat to determine the best 	temporary global solution.
* Updates the bat position $(movement)$ based on the new frequency and speed 	of each bat.
* Comparing the pulse rate of each bat $(𝑟𝑖)$ by generating a real number obtained at random at intervals $(0, 1)$. If the number is generated randomly at the interval $(0,1) > 𝑟𝑖$, a local search is carried out. Then, the local solution results are used as a new position, then do the backpropagation process and calculate the objective function. If not, go straight to the backpropagation process and calculate the objective function
* Comparing loudness of bat $(𝐴𝑖)$ with real numbers that are generated randomly at intervals $(0,1)$ and comparing the value of the new objective function with the old one. If $𝐴𝑖$ is greater than the value of a real number that is randomly generated in the interval $(0,1)$, and if the value of the old objective function $(f(x_i^t))<(f(x_i^t))$ is new then update $𝐴𝑖$ and $𝑟𝑖$, and accept the new solution. But if not, then make the previous position a new position.
* Saves the new solution, loudness, and pulse rate every bat
* Repeat steps f to i, until the maximum iteration is reached
* Save weights and biases after maximum iterations 

### Flowchart
<img width="247" alt="1" src="https://user-images.githubusercontent.com/90967773/200171639-b31a7248-98ec-42c7-bf4c-8db5995467d2.png">
 
## Analysis and Result
Reference data used in this paper is data in the form of an iris image with a PNG file type. Iris images used as many as 90 images which are divided into their use for training and testing data. The amount of data used for training is 60 images, while the amount of data for validation is 30 images. [Iris Database](http://phoenix.inf.upol.cz/iris/)
 
 All iris images that will be used for iris image recognition must be the same size. This size is obtained from the largest size of the image of the iris of the eye that is close to the pupil, this is to avoid interference/noise from the eyelashes reflected on the iris. In this paper, the size of the image used is 180×120 pixels. After all, images are uniform in size, the next step is that the image will enter the background filter and pupil removal process using Adobe Photoshop CC 2019 software. Figure 2 shows the results of the background filter and pupil removal process.
 
<img width="441" alt="2" src="https://user-images.githubusercontent.com/90967773/200773412-4b1cb563-e6a8-4d8b-ba02-74ae5e5d4035.png">
 
 The initial process that must be done before the training and validation process is image processing. Image processing consists of grayscale, segmentation, and continued with the normalization process. The results of the grayscale process are shown in Figure 3.
 
 <img width="315" alt="3" src="https://user-images.githubusercontent.com/90967773/200773466-ad5967fe-bb26-4a95-97c2-5b101908bd26.png">

 The result of the grayscale process is a matrix measuring 180×120, then processed by a segmentation process and followed by a normalization process to produce a matrix measuring 150×1.
 
 The next process is the training process on the backpropagation neural network and the bat algorithm. The parameters of the backpropagation neural network are learning rate, error limit, while the parameters of the bat algorithm are loudness, pulse rate, minimum frequency, maximum frequency, number of individual bats, and maximum iterations.
 
 The backpropagation neural network structure consists of 3 layers, namely 150 units of the input layer, 150 units of the hidden layer, and 6 units of output. In the training process, the MSE value in the backpropagation neural network is used as a component of the objective function value in the bat algorithm.
 
 Training of backpropagation neural network and bat algorithm on the iris image data is done by determining several parameters. In this training, the number of individuals used is 10,30,50 individuals, loudness is set to $0.9$ [6], pulse rate is set to $0.9$ [6] and $0.2$ [13], maximum frequency and minimum frequency are set to $100$ and $0$ [6], the learning rate is set to $0.1,0.5,$ and $0.9$, the maximum iteration is set to $50000$ iterations, and the error limit is set to $0.01$.
 
 The next step is to test the training data using the weights and biases obtained at the stage of the backpropagation neural network and the bat algorithm. the results of the test process on the training data are shown in Table 1.
 
 | No	| Individual	| Learning Rate	| Pulse Rate	| Loudness	| MSE	| Iteration	| Test Result Percentage | 
 |--- | ---------- | ------------- | ---------- | -------- | --- | --------- | ---------------------- | 
 | 1	 | 10	 | 0.1	 | 0.2	 | 0.9	 | 9.89067E-03	 | 15421	 | 100% | 
 | 2	 | 10 | 	0.1 | 	0.9	 | 0.9	 | 3.57277E-02	 | 50000	 | 96% | 
 | 3	 | 10	 | 0.5	 | 0.2	 | 0.9	 | 1.33782E-01	 | 50000 | 	86% | 
 | 4	 | 10	 | 0.5	 | 0.9	 | 0.9	 | 1.00400E-01	 | 50000	 | 90% | 
 | 5	 | 10	 | 0.9	 | 0.2	 | 0.9	 | 1.33515E-01	 | 50000	 | 80% | 
 | 6	 | 10	 | 0.9	 | 0.9	 | 0.9	 | 6.69705E-02	 | 50000	 | 93% | 
 | 7	 | 30	 | 0.1	 | 0.2	 | 0.9	 | 9.73175E-03	 | 17585	 | 100% | 
 | 8	 | 30 | 	0.1	 | 0.9	 | 0.9	 | 9.63255E-03	 | 15796	 | 100% | 
 | ... | ... | ... | ... | ... | ... | ... | ... | 
 | 16	 | 50	 | 0.5	 | 0.9	 | 0.9	 | 6.80639E-02	 | 50000	 | 93% | 
 | 17	 | 50	 | 0.9	 | 0.2	 | 0.9	 | 1.00627E-01	 | 50000	 | 90% | 
 | 18	 | 50	 | 0.9	 | 0.9	 | 0.9	 | 6.73081E-02	 | 50000	 | 93% | 
 
 Based on Table 1 shows that the results of test process on the training data obtained an accuracy rate of 100%, and with the best results, as follows:
 1. Based on the smallest iteration: 2596th iteration, with MSE = 9.94009E-03, number of individuals =30, learning rate =0.5, pulse rate =0.2, loudness=0.9.
 2. Based on the smallest MSE: 14650th iteration, with MSE = 8.99725E-03, number of individuals =50, learning rate =0.1, pulse rate =0.2, loudness=0.9.

 The best results of the test process on the training data are shown in Table 2.
 | No	| Individual	| Learning Rate	| Pulse Rate	| Loudness	| MSE	| Iteration	| Test Result Percentage | 
 |--- | ---------- | ------------- | ---------- | -------- | --- | --------- | ---------------------- | 
 | 30	 | 0.5 | 	0.2 | 	0.9 | 	9.94009E-03 | 	2596	 | 100% | 
 | 50	 | 0.1 | 	0.2	 | 0.9 | 	8.99725E-03 | 	14650	 | 100% | 
 
 The next stage is to do a validation test on 30 iris images that are not used at the training stage. The initial process carried out is to perform image processing, namely grayscale, segmentation, and normalization. The normalization results are used as input for the feedforward process with the weights and biases that have been obtained. The results of the validation test are shown in Table 3.
 
| No	| Individual	| Learning Rate	| Pulse Rate	| Loudness	| MSE	| Iteration	| Test Result Percentage | 
 |--- | ---------- | ------------- | ---------- | -------- | --- | --------- | ---------------------- | 
 | 30 | 	0.5 | 	0.2 | 	0.9 | 	9.94009E-03 | 	2596	 | 83% | 
 | 50 | 	0.1 | 	0.2 | 	0.9 | 	8.99725E-03 | 	14650	 | 90% | 
 
 Based on Table above, the percentage of test results 90% obtained from a variety of parameters with the number of iterations reached 14650 and the MSE value 8.99725E-03 so that the weight and bias used is when the number of individuals is 50, the learning rate is $0.1$, the pulse rate is $0.2$, and loudness $0.9$

## Conclusion
 Based on the discussion and implementation of the program, in the training process using 60 iris image data as training data, it shows that the program can recognize 100% of the training data during the testing training process, with an MSE value of 8.99725E-03, as many as 50 individuals. individual, the learning rate of 0.1, pulse rate of 0.2, the loudness of 0.9, in the 14650th iteration. Based on the results of the validation test, it shows that the accuracy of iris image recognition using a hybrid backpropagation neural network and the bat algorithm is 90%.
 
 ## Bibligography
 * [1] Flom, L., and Safir, A., 1986, Iris recognition system (1986). US Patent 4641349, WIPO Patent 8605018
 * [2]	Daugman, J., 1994, Biometric personal identification system based on iris analysis. US Patent 5291560, WIPO Patent 9409446
 * [3]	Heath, D., 2001, An Overview of Biometrics Support in NetWare Through NMAS/Novel, USA (Online), http://support.novell.com/techcenter/articl-es/ana20010701.html, accessed 27th Desember 2020.
 * [4]	Bowyer, K., 2011, The results of the nice.ii iris biometrics competition. Pattern Recogn. Lett, 33(8), 965–969
 * [5]	Bodade R. M., and Talbar, S. N., 2014, Iris Analysis for Biometric Recognition Systems, 109, Springer, New Delhi
 * [6]	Basuki, A., Jozua F., Palandi, F., 2005, Pengolahan Citra Digital Menggunakan Visual Basic, Penerbit Graha Ilmu, Yogyakarta
 
 
 ##### If you have any questions please contact me via email: bintarisiswiutami@gmail.com

