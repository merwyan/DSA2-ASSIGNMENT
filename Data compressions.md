i) 
Suitable Compression Algorithm(s):
Run-length compression is suitable for msg types of data because of its simplicity and effectiveness in compressing repetitive sequences.
a)Simple Implementation: Run-length compression is straightforward to implement, making it easy to integrate into various systems and applications without requiring complex algorithms or extensive computational resources.
b)Effective for Repetitive Data: It performs well on data with long sequences of repeated symbols or values. run-length compression can achieve significant reductions in msg size.
c)Lossless Compression: Run-length compression is a lossless compression technique, meaning that the original data can be perfectly reconstructed from the compressed data. This makes it suitable for our network because  preserving data integrity is essential.
d)Fast Compression and Decompression: Due to its simplicity, run-length compression typically requires less processing time compared to more complex compression algorithms. This makes it suitable for real-time applications or scenarios where compression and decompression speed are important factors as in our case the msg being communicated between the clients can't afford delay.
e)Low Overhead: Run-length compression adds minimal overhead to the compressed data, as it typically only requires storing the symbol or value and its run length. This makes it efficient in terms of memory usage, especially for datasets with long runs of repeated values.


Decompression:
Decompression in run-length encoding is the process of converting the compressed data back into its original form. The decompression algorithm reverses the compression process by reconstructing the original data from the encoded representation. Here's how decompression is typically done in run-length encoding:
Here are the steps for decompression 
step 1.Read the Compressed Data: Start by reading the compressed data, which consists of pairs of symbols (or values) and their corresponding run lengths.

step2. Repeat Symbols: For each pair in the compressed data, repeat the symbol (or value) the specified number of times according to its run length. This step essentially reconstructs the original sequence by duplicating each symbol the appropriate number of times.

step3. Output the Decompressed Data: As you repeat symbols according to their run lengths, output or store them in a buffer or array to generate the decompressed data.

step4. Continue Until End of Compressed Data: Repeat steps 2 and 3 until you have processed all pairs in the compressed data.

step5. End of Decompression: Once you have processed all pairs and reconstructed the original sequence, you have completed the decompression process. The output or buffer now contains the decompressed data, which is identical to the original uncompressed data.

Here's a simplified pseudocode example illustrating the decompression process:

```plaintext
decompress(compressed_data):
    Initialize an empty output buffer
    for each pair (symbol, run_length) in compressed_data:
        Repeat symbol run_length times
        Append the repeated symbols to the output buffer
    return the output buffer
```

 Worst-Case Time Complexity (d(i))
Worst Case: The worst-case scenario for RLE occurs when the input data consists of a single symbol or character  repeated many times. For example, if the input is "vvvvvvvvvvvvvv", where 'v' is repeated 14 times, RLE would compress this to "v14". In this worst-case scenario, the time complexity would still be linear, O(n), because the algorithm would traverse the input data once to perform the encoding
