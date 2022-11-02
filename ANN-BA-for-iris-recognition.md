# Overview
<h4>[1] The origins of modern iris image recognition were founded in 1986 when Leonard Flom and Aran Safir filed a patent for the first iris image recognition system but without any algorithm. 
[2],[3] The algorithm underlying the iris image recognition was developed by Dr. John Daugman, a Harvard Ph.D. graduate and well-known computer scientist at the University of Cambridge, England. 
Has the US Patent no. 5,291,560 on behalf of Daugman and deployed at Iridian Technologies, Inc., which is one of the world's leading vendors of iris-based systems.
<h4> [4]Among all the biometric characteristics, the texture pattern of the iris is believed to be the most distinguishable. Compared to facial or other characteristics that change more drastically, the iris remains relatively stable and is rarely affected by external elements, because it is located in the inner eye organ. In addition, which distinguishes other biometrics such as fingerprints, the iris is seen as a very reliable biometric technology due to its stability, and the high variation of the iris between individuals.

## Image Processing
<h4>[5]Image processing aims to improve image quality, where the resulting image can provide clear information and 
information on the characteristics of the image is in the form of numeric

### 1. Grayscale
<h5> [5] The color image consists of 3 matrix layers, namely R-layer (r), G-layer (g), and B-layer (b) 
with the value of an image being represented between 0 to 255. This process converts the 3 layers above into 1 matrix layer. 
gray-scale(s) and the result is a gray-scale image. In this image there is no more color, there is a degree of gray.

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

* Inputting data and initializing the parameters of the bat algorithm and backpropagation neural network. Backpropagation parameters are target error, and learning rate. The parameters of the bat algorithm are the initial population of bats (pop size), maximum iteration (t), loudness decrease coefficient (𝛼), pulse rate increase coefficient (𝛾), minimum frequency ( f𝑚 ), maximum frequency (fmax ).
* Generating initial population of bats consisting of position (𝑥𝑖), speed (𝑣𝑖), loudness (𝐴𝑖), pulse rate (𝑟𝑖).
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
* Compare the objective function values of each bat to determine the best 	temporary global solution.
* Updates the bat position (movement) based on the new frequency and speed 	of each bat.
* Comparing the pulse rate of each bat (𝑟𝑖) by generating a real number obtained at random at intervals (0, 1). If the number is generated randomly at the interval (0,1) > 𝑟𝑖, a local search is carried out. Then, the local solution results are used as a new position, then do the backpropagation process and calculate the objective function. If not, go straight to the backpropagation process and calculate the objective function
* Comparing loudness of bat (𝐴𝑖) with real numbers that are generated randomly at intervals (0,1) and comparing the value of the new objective function with the old one. If 𝐴𝑖 is greater than the value of a real number that is randomly generated in the interval (0,1), and if the value of the old objective function 〖f(x〗_i^t)<〖f(x〗_i^t) is new then update 𝐴𝑖 and 𝑟𝑖, and accept the new solution. But if not, then make the previous position a new position.
* Saves the new solution, loudness, and pulse rate every bat
* Repeat steps f to i, until the maximum iteration is reached
* Save weights and biases after maximum iterations 


