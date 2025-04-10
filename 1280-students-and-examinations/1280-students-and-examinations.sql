/*
Write a solution to find the number of times each student attended each exam.

Return the result table ordered by student_id and subject_name.
*/

SELECT S.student_id, S.student_name, J.subject_name, COUNT(E.student_id) 'attended_exams'
FROM Students S
CROSS JOIN Subjects J
LEFT JOIN Examinations E
ON S.student_id = E.student_id AND E.subject_name = J.subject_name
GROUP BY S.student_id, J.subject_name
ORDER BY S.student_id, J.subject_name;