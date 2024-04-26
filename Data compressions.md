i) 
Suitable Compression Algorithm(s):
In a star topology network with a central server mediating communication, a dictionary-based compression algorithm like LZ77 (Lempel-Ziv 77) could be well-suited for compressing messages sent between clients. 
Because:
Repetitive Data: If messages between clients contain duplicates, such as common words or data patterns, LZ77 can use these for compression.
Centralized Management: The server can function as a central repository for the LZ77 dictionary. This dictionary can hold previously encountered substrings and their references. Clients can then refer to these references in their messages rather than transmitting the whole substring multiple times.

Decompression:
The server maintains the dictionary throughout the communication. When it receives a message with references, it uses the dictionary to replace those references with the actual substrings, reconstructing the original message.
Worst-Case Time Complexity (d(i))
The worst-case time complexity of LZ77 compression and decompression is O(n^2), where n is the length of the message.
•	Compression: In the worst case, the entire message might consist of unique characters, requiring iterating through the entire message (n times) for each character to find matches in the dictionary (potentially another n comparisons).
•	Decompression: Decompression involves looking up references in the dictionary. In the worst case, each character in the compressed message might be a reference, leading to n lookups in the dictionary, resulting in O(n) complexity. 
