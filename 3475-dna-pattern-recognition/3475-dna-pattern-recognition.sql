/*
Biologists are studying basic patterns in DNA sequences. Write a solution to identify sample_id with the following patterns:

Sequences that start with ATG (a common start codon)
Sequences that end with either TAA, TAG, or TGA (stop codons)
Sequences containing the motif ATAT (a simple repeated pattern)
Sequences that have at least 3 consecutive G (like GGG or GGGG)
Return the result table ordered by sample_id in ascending order.
*/
SELECT sample_id,
    dna_sequence,
    species, 
    dna_sequence REGEXP '^ATG' AS has_start, 
    dna_sequence REGEXP 'TAA$|TAG$|TGA$' AS has_stop, 
    dna_sequence REGEXP 'ATAT' AS has_atat, 
    dna_sequence REGEXP 'GGG' AS has_ggg
FROM Samples
ORDER BY sample_id;