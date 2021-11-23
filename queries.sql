-- Part 1: Test it with SQL
 id (int, PK), employer(varchar 255), name(varchar 255), skills(varchar 255)
-- Part 2: Test it with SQL
select name from employer where location = "St. Louis City";
-- Part 3: Test it with SQL
drop table job;
-- Part 4: Test it with SQL
--SELECT * FROM skill LEFT JOIN job_skills ON (skill.id = job_skills.skills_id) WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;
--SELECT job.name, skill.description
--FROM skill, job
--INNER JOIN job_skills ON job.id = job_skills.jobs_id
--WHERE skill.id = job_skills.skills_id
--ORDER BY job.name ASC;
SELECT * FROM skill
      LEFT JOIN job_skills ON skill.id = job_skills.skills_id
      WHERE job_skills.jobs_id IS NOT NULL
      ORDER BY name ASC;